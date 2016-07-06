#ifndef __ANDROID_JNI_H__
#define __ANDROID_JNI_H__

/**
 * This define the reg class for jni call
 */
#define JNIREG_CLASS "android/bluros/utils/BlurOSUtils"

JNIEXPORT jboolean JNICALL isSupportLanguage (JNIEnv* env, jclass thiz, jboolean excludeVN);

/**
 * Table of methods associated with a single class.
 */
static JNINativeMethod gMethods[] = {
    {
        "isSupportLanguage", "(Z)Z",
        (void*) isSupportLanguage
    },
    /* <<----Functions for sync end--------------------------------- */
};

#endif
