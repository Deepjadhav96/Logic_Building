#include<stdio.h>
#include<fcntl.h> // file IO system call
//fcnt ==> file control
int main()
{
    int fd = 0;
    fd = creat("Marvellous.txt",0777);

    if(fd == -1)
    {
        printf("Unable to createt file\n");

    }
    else
    {
        printf("File gets successfully created\n");

    }

    return 0;
}