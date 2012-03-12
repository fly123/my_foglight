
package com.quest.agent.urlmonitor.samples;

import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This is a helper class which represents the current or aggregate
 * values of a metric.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class SampleMetric {

    private final Double _value;
    private final Double _count;
    private final Double _sum;
    private final Double _sum_of_squares;
    private final Double _min;
    private final Double _max;
    private final Double _average;

    /**
     * Creates a metric with the provided value. All aggregate values will be null
     * 
     */
    public SampleMetric(Double value) {
        _value = value;
        _count = null;
        _sum = null;
        _sum_of_squares = null;
        _min = null;
        _max = null;
        _average = null;
    }

    /**
     * Creates a metric with the provided aggregate values. The current value will be null.
     * 
     */
    public SampleMetric(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _value = null;
        _count = count;
        _sum = sum;
        _sum_of_squares = sum_of_squares;
        _min = min;
        _max = max;
        _average = (sum/count);
    }

    /**
     * Creates a metric with the provided aggregate values. The current value will be null.
     * 
     */
    public SampleMetric(Double count, Double sum) {
        this(count, sum, (count*((sum/count)*(sum/count))), (sum/count), (sum/count));
    }

    public Double getValue() {
        return _value;
    }

    public Double getCount() {
        return _count;
    }

    public Double getSum() {
        return _sum;
    }

    public Double getSumOfSquares() {
        return _sum_of_squares;
    }

    public Double getMin() {
        return _min;
    }

    public Double getMax() {
        return _max;
    }

    public Double getAverage() {
        return _average;
    }

    void submit(TopologyNode currentNode, com.quest.glue.api.services.UnitService.Units units) {
        if (!(_value == null)) {
            final TopologyValue _value1 = currentNode.createValue("value");
            _value1 .setSampleValue(_value, units);
        } else {
            final TopologyValue _value2 = currentNode.createValue("count");
            _value2 .setSampleValue(_count, units);
            final TopologyValue _value3 = currentNode.createValue("sum");
            _value3 .setSampleValue(_sum, units);
            final TopologyValue _value4 = currentNode.createValue("sumsquares");
            _value4 .setSampleValue(_sum_of_squares, units);
            final TopologyValue _value5 = currentNode.createValue("min");
            _value5 .setSampleValue(_min, units);
            final TopologyValue _value6 = currentNode.createValue("max");
            _value6 .setSampleValue(_max, units);
            final TopologyValue _value7 = currentNode.createValue("avg");
            _value7 .setSampleValue(_average, units);
        }
    }

}
