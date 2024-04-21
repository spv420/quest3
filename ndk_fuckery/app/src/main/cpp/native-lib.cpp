#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
MainActivity.fuck_it_up(
        JNIENV *env,
        jobject
        ) {
    printf("c++ shit\n");
    return;
}