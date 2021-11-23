# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
FLAGS=`pkg-config --cflags --libs gstreamer-1.0`

SOURCES = transform_display.c

TARGETS = $(foreach n,$(SOURCES),$(basename $(n)))

all: ${TARGETS}

.PHONY: all clean install

${TARGETS}: %:%.c
	$(CC) -Wall $< -o $@ $(FLAGS)

clean:
	rm -f ${TARGETS}

install: install_transform_display

install_transform_display: transform_display
	install -d $(DESTDIR)
	install -m 755 transform_display $(DESTDIR)