# YouTrack Job Thread Pool metrics

## All metrics

- youtrack_JobThreadPool_MaxPoolSize
- youtrack_JobThreadPool_CurrentPoolSize
- youtrack_JobThreadPool_ActiveThreads
- youtrack_JobThreadPool_AutoscalingEnabled

## All job thread pools

- agileUserProfileJobThreadPool
- AICommandsJobThreadPool
- AISuggestionsJobThreadPool
- articleAnalysisJobThreadPool
- articlesExportJobThreadPool
- asyncUIJobThreadPool
- cleanupJobThreadPool
- ganttJobThreadPool
- globalSchedulingJobThreadPool
- hubIntegrationJobThreadPool
- importsJobThreadPool
- instantImageOcrThreadPool
- issueAnalysisJobThreadPool
- localSchedulingJobThreadPool
- mailboxJobThreadPool
- maintenanceJobThreadPool
- notificationAnalyzerJobThreadPool
- notificationJobThreadPool
- permissionCacheJobThreadPool
- persistentUserJobThreadPool
- predefinedScriptJobThreadPool
- remoteResultPollingThreadPool
- reportsJobThreadPool
- scheduledImageOcrThreadPool
- sendingDurabilityJobThreadPool
- similarIssuesJobThreadPool
- textIndexJobThreadPool
- userPrefixTreeJobThreadPool
- userProfileJobThreadPool
- vcsJobThreadPool
- workflowEventJobThreadPool
- workflowScheduledJobThreadPool
- zendeskIntegrationJobThreadPool

## hubIntegrationJobThreadPool
See also:
- [YouTrack HubIntegration metrics](YouTrack-HubIntegration.md)

## importsJobThreadPool

## notificationAnalyzerJobThreadPool

## notificationJobThreadPool

see also
```ini
# HELP youtrack_NotificationsSender_EmailSendingErrors Number of notification email errors since startup. Bounces are not included. (jetbrains.youtrack<type=Notifications, name=NotificationsSender><>EmailSendingErrors)
# TYPE youtrack_NotificationsSender_EmailSendingErrors untyped
youtrack_NotificationsSender_EmailSendingErrors{type="Notifications",} 0.0
```

# permissionCacheJobThreadPool

# zendeskIntegrationJobThreadPool

see also
```ini
# HELP youtrack_ZendeskIntegration_FailedImports Number of failed import attempts (jetbrains.youtrack<type=Imports, name=ZendeskIntegration><>FailedImports)
# TYPE youtrack_ZendeskIntegration_FailedImports untyped
youtrack_ZendeskIntegration_FailedImports{type="Imports",} 0.0
```