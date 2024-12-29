#include<stdio.h>

int main(){
    char string[] = "Hello World";
    for(int i=0;string[i] !='\0';i++){
        string[i] = string[i]^0;
    }
    printf("XORed String :%s",string);
}