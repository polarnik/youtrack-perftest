package com.jetbrains.youtrack.perftest.scenario.sitespeed.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://youtrack.jetbrains.com/api/config?fields=build,defaultPage,readOnly,version
 * {
 *   "defaultPage": "/issues",
 *   "build": "66150",
 *   "readOnly": false,
 *   "version": "2025.2",
 *   "$type": "FrontendConfig"
 * }
 */
@Getter
@Setter
public class YouTrackConfig {
    public String defaultPage;
    public String build;
    public boolean readOnly;
    public String version;
}
