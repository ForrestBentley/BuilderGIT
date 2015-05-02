//************************************************************************
//* Program : HTMLFix.c
//* Author  : Forrest Bentley
//* Date    : 01/29/2014
//* Desc    : This program will read an HTML file and split tag lines
//*
//* Change Log
//* Date       Author          Desc
//* ---------- --------------- --------------------------------------
//* 01/29/2014 Forrest Bentley Created HTMLFix.c
//*
//************************************************************************

#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <MALLOC.h>
#include <conio.h>
#include <io.h>
#include <errno.h>
#include <direct.h>

    FILE       *InputFile;
    FILE       *OutputFile;

    char       *cFileStatus;
    char       *szInput;
    char       szOutput[30000];

    int        IndexIn;
    int        IndexOut;
    int        CheckPos;

main ()
{
    //**************************************************
    //* Open Input File
    //**************************************************
    InputFile = fopen ("htmlfix.html", "r");
    if  (!InputFile)
    {
        printf("Unable to open cnn.html\n");
        exit (1);
    }
    szInput = (char *) malloc (30000);
    if  (!szInput)
    {
        printf("Unable to allocate szInput\n");
        exit (1);
    }
    //**************************************************
    //* Open Output File
    //**************************************************
    OutputFile = fopen ("htmlfix.dat", "w");

    //**************************************************
    //* Read the Input File
    //**************************************************
    do {
        cFileStatus = fgets (szInput, 30000, InputFile);
        if  (cFileStatus != NULL) {

            IndexIn        = 0;
            IndexOut       = 0;
            szInput[30000] = 0;

            do  {
                if  (szInput[IndexIn] != 0) {
                    CheckPos = IndexIn + 1;
                    if  (memcmp (szInput + CheckPos, "</", 2) == 0) {
                        szOutput[IndexOut] = szInput[IndexIn];
                        IndexOut++;
                        szOutput[IndexOut] = 0;
                        CheckPos = IndexOut - 1;
                        if  (szOutput[CheckPos] != '\n') {
                            strcat (szOutput, "\n");
                        }
                        fputs (szOutput, OutputFile);
                        IndexOut = 0;
                    }
                    else {
                        CheckPos = IndexIn + 1;
                        if  ((IndexOut > 0) && (szInput[CheckPos] == '<')) {
                            szOutput[IndexOut] = szInput[IndexIn];
                            IndexOut++;
                            szOutput[IndexOut] = 0;
                            CheckPos = IndexOut - 1;
                            if  (szOutput[CheckPos] != '\n') {
                                strcat (szOutput, "\n");
                            }
                            fputs (szOutput, OutputFile);
                            IndexOut = 0;
                        }
                        else {
                            CheckPos = IndexIn + 1;
                            if  (memcmp (szInput + CheckPos, "/>", 2) == 0) {
                                szOutput[IndexOut] = szInput[IndexIn];
                                IndexOut++;
                                szOutput[IndexOut] = 0;
                                strcat (szOutput, "/>\n");
                                fputs (szOutput, OutputFile);
                                IndexOut = 0;
                                IndexIn = IndexIn + 2;
                            }
                            else {
                                szOutput[IndexOut] = szInput[IndexIn];
                                IndexOut++;
                            }
                        }
                    }
                    IndexIn++;
                }
            }
            while (szInput[IndexIn] != 0);
            if  (IndexOut > 0) {
                szOutput[IndexOut] = 0;
                IndexOut++;
                CheckPos = IndexOut - 1;
                if  (szOutput[CheckPos] != '\n') {
                    //strcat (szOutput, "\n");
                }
                fputs (szOutput, OutputFile);
            }
        }
    }
    while (cFileStatus != NULL);

    printf("HTML File Fixed -> HTMLFix.dat\n");

    //**************************************************
    //* Close the Files
    //**************************************************
    fclose (InputFile);
    fclose (OutputFile);
    if (cFileStatus == NULL) {
       exit (0);
    }
    return (0);
}

//*************************************************
//* End of program HTMLFix.c
//*************************************************