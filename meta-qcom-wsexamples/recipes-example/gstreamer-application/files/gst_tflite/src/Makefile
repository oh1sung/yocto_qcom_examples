# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
FLAGS=`pkg-config --cflags --libs gstreamer-1.0`

SOURCES = \
	tflite_object_detection.c

TARGETS = $(foreach n,$(SOURCES),$(basename $(n)))

all: ${TARGETS}

.PHONY: all clean install

${TARGETS}: %:%.c
	$(CC) -Wall $< -o $@ $(FLAGS)

clean:
	rm -f ${TARGETS}

install: install_tflite_object_detection

install_tflite_object_detection: tflite_object_detection
	install -d $(DESTDIR)
	install -m 755 tflite_object_detection $(DESTDIR)