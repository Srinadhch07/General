#include<stdio.h>

int main(){
    char string[] = "Hello world";

    for(int i=0; string[i] !='\0';i++){
        string[i] = string[i]&127;
        string[i]=string[i]^127; 
        printf("flag");
    }
    printf("Encrypted text with AND and XOR : %s",string);
    return 0;
}