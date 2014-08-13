package com.evaluador;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;

public class Cotizaciones {

	static final Map<ClaveCompuesta,Double> cotizaciones = new HashMap<ClaveCompuesta, Double>() {{

		//Cotizaciones de marzo 2014
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-1")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-1")), 215.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-1")), 13.45);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-2")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-2")), 216.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-2")), 13.25);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-3")), 288.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-3")), 216.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-3")), 12.8);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-4")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-4")), 213.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-4")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-5")), 292.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-5")), 215.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-5")), 14.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-6")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-6")), 212.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-6")), 13.5);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-7")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-7")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-7")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-8")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-8")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-8")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-9")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-9")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-9")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-10")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-10")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-10")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-11")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-11")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-11")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-12")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-12")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-12")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-13")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-13")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-13")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-14")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-14")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-14")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-15")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-15")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-15")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-16")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-16")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-16")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-17")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-17")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-17")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-18")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-18")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-18")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-19")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-19")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-19")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-20")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-20")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-20")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-21")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-21")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-21")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-22")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-22")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-22")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-23")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-23")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-23")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-24")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-24")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-24")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-25")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-25")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-25")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-26")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-26")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-26")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-27")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-27")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-27")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-28")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-28")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-28")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-29")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-29")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-29")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-30")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-30")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-30")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-3-31")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-3-31")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-3-31")), 13.0);
		
		//Cotizaciones de abril 2014
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-1")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-1")), 215.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-1")), 13.45);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-2")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-2")), 216.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-2")), 13.25);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-3")), 288.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-3")), 216.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-3")), 12.8);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-4")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-4")), 213.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-4")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-5")), 292.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-5")), 215.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-5")), 14.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-6")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-6")), 212.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-6")), 13.5);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-7")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-7")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-7")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-8")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-8")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-8")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-9")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-9")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-9")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-10")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-10")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-10")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-11")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-11")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-11")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-12")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-12")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-12")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-13")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-13")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-13")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-14")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-14")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-14")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-15")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-15")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-15")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-16")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-16")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-16")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-17")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-17")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-17")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-18")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-18")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-18")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-19")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-19")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-19")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-20")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-20")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-20")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-21")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-21")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-21")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-22")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-22")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-22")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-23")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-23")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-23")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-24")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-24")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-24")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-25")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-25")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-25")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-26")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-26")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-26")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-27")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-27")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-27")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-28")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-28")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-28")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-29")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-29")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-29")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-4-30")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-4-30")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-4-30")), 13.0);
		
		//Cotizaciones de mayo 2014
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-1")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-1")), 215.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-1")), 13.45);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-2")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-2")), 216.5);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-2")), 13.25);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-3")), 288.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-3")), 216.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-3")), 12.8);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-4")), 294.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-4")), 213.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-4")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-5")), 292.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-5")), 215.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-5")), 14.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-6")), 290.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-6")), 212.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-6")), 13.5);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-7")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-7")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-7")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-8")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-8")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-8")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-9")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-9")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-9")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-10")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-10")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-10")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-11")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-11")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-11")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-12")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-12")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-12")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-13")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-13")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-13")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-14")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-14")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-14")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-15")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-15")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-15")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-16")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-16")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-16")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-17")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-17")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-17")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-18")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-18")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-18")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-19")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-19")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-19")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-20")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-20")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-20")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-21")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-21")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-21")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-22")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-22")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-22")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-23")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-23")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-23")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-24")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-24")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-24")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-25")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-25")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-25")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-26")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-26")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-26")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-27")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-27")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-27")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-28")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-28")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-28")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-29")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-29")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-29")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-30")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-30")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-30")), 13.0);
		put(new ClaveCompuesta("YPF", new DateTime("2014-5-31")), 293.0);
		put(new ClaveCompuesta("TS", new DateTime("2014-5-31")), 214.0);
		put(new ClaveCompuesta("GGAL", new DateTime("2014-5-31")), 13.0);
		
	}};

	public static Double cotizacionDeAccionEnFecha(String accion, DateTime fecha) {
		return cotizaciones.get(new ClaveCompuesta(accion,fecha));
	}

	public static Set<String> acciones() {
		Set<String> ret = new HashSet<String>();
		
		for (ClaveCompuesta clave : cotizaciones.keySet()) {
			ret.add(clave.accion());
		}
		return ret;
	}

	public static double promedioDeCotizacionesHastaLaFecha(String accion,	DateTime fecha) {
		int sumatoria = 0;
		int cantidad = 0;
		for (ClaveCompuesta clave : cotizaciones.keySet()) {
			if (clave.accion().equals(accion) && clave.fecha().isBefore(fecha)) {
				sumatoria += cotizaciones.get(clave);
				cantidad++;
			}
		}
		double promedio;
		if (cantidad == 0)
			promedio = 0;
		else
			promedio = sumatoria/cantidad;
		return promedio;
	}
	
}
