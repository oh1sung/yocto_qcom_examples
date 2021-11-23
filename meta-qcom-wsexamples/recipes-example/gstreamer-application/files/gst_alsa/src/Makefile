# Copyright (c) 2020 Qualcomm Innovation Center, Inc.  All Rights Reserved.
# SPDX-License-Identifier: BSD-3-Clause-Clear

CC = $(CCLD)
CFLAGS += $(shell pkg-config --cflags --libs gstreamer-1.0)

TARGET = gst_audio_sample

$(TARGET): $(TARGET).c
	$(CC) $< -o $@ $(CFLAGS) $(LDFLAGS)

.PHONY: clean


install: install_gst_audio_sample 

install_gst_audio_sample: gst_audio_sample
	install -d $(DESTDIR)
	install -m 755 gst_audio_sample $(DESTDIR)

clean:
	rm -f $(TARGET)
