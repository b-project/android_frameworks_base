/*
 * Copyright (C) 2016 The BlurOS Project 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.bluros.lunar;

import android.content.res.Resources;

import java.util.Locale;

/**
 * Created by LinhPhi on 2016/06/11.
 */
public class Constant {

    public static final String STATUS_LEAP_VN = "Nhuận";
    public static final String STATUS_YEAR_VN= "Năm";
    public static final String STATUS_MONTH_VN= "月";
    public static final String STATUS_DAY_VN= "Ngày";
    public static final String STATUS_CHUSHI_VN = "Mười";
    public static final String STATUS_ERSHI_VN = "Hai mươi";
    public static final String STATUS_SANSHI_VN = "Ba mươi";
    public static final String STATUS_FORMAT_1_VN = " Ngày dd Tháng MM Năm yyyy ";
    public static final String STATUS_FORMAT_2_VN = "Ngày 31 Tháng 01 Năm 1900";
    public static final String[] GAN_VN = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
    public static final String[] ZHI_VN = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    public static final String[] VIETNAM_NUMBER_VN = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười", "Mười một", "Mười hai"};
    public static final String[] VIETNAM_TEN_VN = {"Bắt đầu", "Mười", "Hai mươi", "Ba mươi"};
    public static final String[] SOLAR_TERM_VN = {"", "小寒", "大寒", "立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至"};
    public static final String[] LUNAR_MONTH_NAME_VN = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười", "Mười một", "Mười hai"};

    public static final String[] ANIMALS_VN = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
 
    public static final String[] LUNAR_FESTIVAL_VN = {"腊月廿九 除夕", "腊月三十 除夕", "正月初一 春节", "正月十五 元宵节", "五月初五 端午节", "七月初七 七夕节", "七月十五 中元节", "八月十五 中秋节", "九月初九 重阳节", "腊月初八 腊八节", "腊月廿三 小年"};
    public static final String[] HOLIDAY_VN = {"Tết nguyên đán 0101", "Lẽ tình yêu 0214", "0308 Quốc tế phụ nữ", "0312 Thành lập đảng",
                    "0315 消费日", "0401 愚人节", "0413 泼水节", "0501 劳动节", "0504 青年节", "0601 儿童节",
                    "0701 建党日", "0801 建军节", "0903 抗战胜利", "0910 教师节", "1001 国庆节", "1031 万圣节",
                    "1111 光棍节", "1224 平安夜", "1225 圣诞节"};

    public static String[] getAnimals() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (locale.getCountry().equals("VN")) {
            return ANIMALS_VN;
        }
    }

    public static String[] getLunarFestival() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (locale.getCountry().equals("VN")) {
            return LUNAR_FESTIVAL_VN;
        }
    }

    public static String[] getSolarHoliday() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (locale.getCountry().equals("VN")) { 
            return HOLIDAY_VN;		
		}
	}

    public static String getLeap(){
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (locale.getCountry().equals("VN")) {
            return STATUS_LEAP_VN;
        }
    }

}
