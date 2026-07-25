#include<stdio.h>
#include<fcntl.h> 
#include<unistd.h> //ONLY LINUX BASED OS
#include<string.h>

#define BUFFER_SIZE 100



int main()
{
   unlink("Marvellous.txt");
    return 0;
}