
#include <cutils/properties.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <stdio.h>

JNIEXPORT jboolean JNICALL isSupportLanguage (JNIEnv* env, jclass thiz, jboolean excludeVN) {
    char locale[PROPERTY_VALUE_MAX];

    property_get("persist.sys.locale", locale, "");

    if (excludeVN) 
    {
        return (strstr(locale, "vi") && !strstr(locale, "VN")) ? JNI_TRUE : JNI_FALSE;
    } else {
        return strstr(locale, "VN") ? JNI_TRUE : JNI_FALSE;
    }
}
