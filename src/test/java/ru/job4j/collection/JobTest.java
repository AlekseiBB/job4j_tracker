package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void testSortByNameAsc() {
        Comparator<Job> cmpByNameAsc = new JobAscByName();
        Job job1 = new Job("Fix bug", 0);
        Job job2 = new Job("Impl task", 1);

        int rsl = cmpByNameAsc.compare(job1, job2);
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void testSortByPriorityAsc() {
        Comparator<Job> cmpByPriorityAsc = new JobAscByPriority();
        Job job1 = new Job("Fix bug", 0);
        Job job2 = new Job("Impl task", 1);

        int rsl = cmpByPriorityAsc.compare(job1, job2);
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void testSortByNameDesc() {
        Comparator<Job> cmpByNameDesc = new JobDescByName();
        Job job1 = new Job("Fix bug", 0);
        Job job2 = new Job("Impl task", 1);

        int rsl = cmpByNameDesc.compare(job1, job2);
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void testSortByPriorityDesc() {
        Comparator<Job> cmpByPriorityDesc = new JobDescByPriority();
        Job job1 = new Job("Fix bug", 0);
        Job job2 = new Job("Impl task", 1);

        int rsl = cmpByPriorityDesc.compare(job1, job2);
        assertThat(rsl).isGreaterThan(0);

    }

    @Test
    public void testEqualByName() {
        Comparator<Job> cmpByNameEqual = new JobDescByName();
        Job job1 = new Job("FixTest", 88);
        Job job2 = new Job("FixTest", 111);

        int rsl = cmpByNameEqual.compare(job1, job2);
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void testEqualByPriority() {
        Comparator<Job> cmpByPriorityEqual = new JobDescByPriority();
        Job job1 = new Job("Fix bug", 99);
        Job job2 = new Job("Impl task", 99);

        int rsl = cmpByPriorityEqual.compare(job1, job2);
        assertThat(rsl).isEqualTo(0);

    }

    @Test
    public void whenCompatorByNameAndProrityDesc() {
        Comparator<Job> cmpNamePriorityDesc = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriorityDesc.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorByNameAndProrityDescEqualName() {
        Comparator<Job> cmpNamePriorityDesc = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriorityDesc.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByNameAndProrityAsc() {
        Comparator<Job> cmpNamePriorityAsc = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriorityAsc.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByNameAndProrityAscEqualPrority() {
        Comparator<Job> cmpNamePriorityAsc = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriorityAsc.compare(
                new Job("Fix bug", 77),
                new Job("Fix bug", 77)
        );
        assertThat(rsl).isEqualTo(0);
    }
}
