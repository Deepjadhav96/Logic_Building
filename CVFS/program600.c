#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

//Change in parameter of function than previous program
int CalculateFileSize(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0, iSize = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open files\n");
        return -1;
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        iSize = iSize + iRet;
       
    }
     return iSize;

    close(fd);

}

int main()
{ 
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the file name: ");
    scanf("%[^'\n']s",Fname);
    
   iRet =  CalculateFileSize(Fname);
   printf("Size of file is : %d\n",iRet);
    
    return 0;
}