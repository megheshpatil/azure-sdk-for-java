// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.SnapshotPoliciesList;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"kghimdblxgwimfnj\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":510557599,\"minute\":1675220188,\"usedBytes\":1198847986383751038},\"dailySchedule\":{\"snapshotsToKeep\":1767053067,\"hour\":739435613,\"minute\":1563203885,\"usedBytes\":8338807266312513089},\"weeklySchedule\":{\"snapshotsToKeep\":1648570452,\"day\":\"aw\",\"hour\":113630721,\"minute\":841259449,\"usedBytes\":9051460600298746000},\"monthlySchedule\":{\"snapshotsToKeep\":220414413,\"daysOfMonth\":\"c\",\"hour\":1974208739,\"minute\":833171610,\"usedBytes\":2411008459227076557},\"enabled\":true,\"provisioningState\":\"abfatkl\"},\"location\":\"xbjhwuaanozjosph\",\"tags\":{\"jrvxaglrv\":\"l\",\"tcs\":\"mjwosytx\"},\"id\":\"fcktqumiekke\",\"name\":\"zikhl\",\"type\":\"fjhdg\"}]}")
            .toObject(SnapshotPoliciesList.class);
        Assertions.assertEquals("xbjhwuaanozjosph", model.value().get(0).location());
        Assertions.assertEquals("l", model.value().get(0).tags().get("jrvxaglrv"));
        Assertions.assertEquals(510557599, model.value().get(0).hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(1675220188, model.value().get(0).hourlySchedule().minute());
        Assertions.assertEquals(1198847986383751038L, model.value().get(0).hourlySchedule().usedBytes());
        Assertions.assertEquals(1767053067, model.value().get(0).dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(739435613, model.value().get(0).dailySchedule().hour());
        Assertions.assertEquals(1563203885, model.value().get(0).dailySchedule().minute());
        Assertions.assertEquals(8338807266312513089L, model.value().get(0).dailySchedule().usedBytes());
        Assertions.assertEquals(1648570452, model.value().get(0).weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("aw", model.value().get(0).weeklySchedule().day());
        Assertions.assertEquals(113630721, model.value().get(0).weeklySchedule().hour());
        Assertions.assertEquals(841259449, model.value().get(0).weeklySchedule().minute());
        Assertions.assertEquals(9051460600298746000L, model.value().get(0).weeklySchedule().usedBytes());
        Assertions.assertEquals(220414413, model.value().get(0).monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("c", model.value().get(0).monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1974208739, model.value().get(0).monthlySchedule().hour());
        Assertions.assertEquals(833171610, model.value().get(0).monthlySchedule().minute());
        Assertions.assertEquals(2411008459227076557L, model.value().get(0).monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPoliciesList model = new SnapshotPoliciesList().withValue(Arrays.asList(new SnapshotPolicyInner()
            .withLocation("xbjhwuaanozjosph").withTags(mapOf("jrvxaglrv", "l", "tcs", "mjwosytx"))
            .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(510557599).withMinute(1675220188)
                .withUsedBytes(1198847986383751038L))
            .withDailySchedule(new DailySchedule().withSnapshotsToKeep(1767053067).withHour(739435613)
                .withMinute(1563203885).withUsedBytes(8338807266312513089L))
            .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(1648570452).withDay("aw").withHour(113630721)
                .withMinute(841259449).withUsedBytes(9051460600298746000L))
            .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(220414413).withDaysOfMonth("c")
                .withHour(1974208739).withMinute(833171610).withUsedBytes(2411008459227076557L))
            .withEnabled(true)));
        model = BinaryData.fromObject(model).toObject(SnapshotPoliciesList.class);
        Assertions.assertEquals("xbjhwuaanozjosph", model.value().get(0).location());
        Assertions.assertEquals("l", model.value().get(0).tags().get("jrvxaglrv"));
        Assertions.assertEquals(510557599, model.value().get(0).hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(1675220188, model.value().get(0).hourlySchedule().minute());
        Assertions.assertEquals(1198847986383751038L, model.value().get(0).hourlySchedule().usedBytes());
        Assertions.assertEquals(1767053067, model.value().get(0).dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(739435613, model.value().get(0).dailySchedule().hour());
        Assertions.assertEquals(1563203885, model.value().get(0).dailySchedule().minute());
        Assertions.assertEquals(8338807266312513089L, model.value().get(0).dailySchedule().usedBytes());
        Assertions.assertEquals(1648570452, model.value().get(0).weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("aw", model.value().get(0).weeklySchedule().day());
        Assertions.assertEquals(113630721, model.value().get(0).weeklySchedule().hour());
        Assertions.assertEquals(841259449, model.value().get(0).weeklySchedule().minute());
        Assertions.assertEquals(9051460600298746000L, model.value().get(0).weeklySchedule().usedBytes());
        Assertions.assertEquals(220414413, model.value().get(0).monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("c", model.value().get(0).monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1974208739, model.value().get(0).monthlySchedule().hour());
        Assertions.assertEquals(833171610, model.value().get(0).monthlySchedule().minute());
        Assertions.assertEquals(2411008459227076557L, model.value().get(0).monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
