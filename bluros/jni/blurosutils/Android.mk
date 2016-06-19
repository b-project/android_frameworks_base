#  
# Copyright (C) 2015 The BlurOS Project 
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#

LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_CFLAGS := -O3
LOCAL_CXXFLAGS := -O3
LOCAL_MODULE    := libblurosutils
LOCAL_SRC_FILES := blurosutils.c androidjni.c
LOCAL_C_INCLUDES += $(JNI_H_INCLUDE)
LOCAL_PRELINK_MODULE := false
LOCAL_SHARED_LIBRARIES += liblog libcutils libc
LOCAL_MODULE_TAGS := optional

include $(BUILD_SHARED_LIBRARY)
