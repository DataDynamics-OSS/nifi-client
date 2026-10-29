# SchedulingDefaults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultConcurrentTasksBySchedulingStrategy** | **Map&lt;String, Integer&gt;** | The default concurrent tasks for each scheduling strategy |  [optional]
**defaultMaxConcurrentTasks** | **String** | The default concurrent tasks |  [optional]
**defaultRunDurationNanos** | **Long** | The default run duration in nano-seconds |  [optional]
**defaultSchedulingPeriodMillis** | **Long** | The default scheduling period in milliseconds |  [optional]
**defaultSchedulingPeriodsBySchedulingStrategy** | **Map&lt;String, String&gt;** | The default scheduling period for each scheduling strategy |  [optional]
**defaultSchedulingStrategy** | [**DefaultSchedulingStrategyEnum**](#DefaultSchedulingStrategyEnum) | The name of the default scheduling strategy |  [optional]
**penalizationPeriodMillis** | **Long** | The default penalization period in milliseconds |  [optional]
**yieldDurationMillis** | **Long** | The default yield duration in milliseconds |  [optional]

<a name="DefaultSchedulingStrategyEnum"></a>
## Enum: DefaultSchedulingStrategyEnum
Name | Value
---- | -----
TIMER_DRIVEN | &quot;TIMER_DRIVEN&quot;
CRON_DRIVEN | &quot;CRON_DRIVEN&quot;
