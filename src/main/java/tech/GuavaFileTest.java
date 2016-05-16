package tech;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.google.common.io.LineProcessor;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;


//原来的代码

/**
 * Some comments here
public String getFoo()
        {
public void dealFile(File file, final Result result) throws IOException {
        Files.readLines(file, Charsets.UTF_8, new LineProcessor<Result>() {
public boolean processLine(String s) throws IOException {
        return true;
        }

public Result getResult() {
        return result;
        }
        });
        }
        }
 *
 *
 *
 *
 */

/**
 * Created by tangjie on 16/5/16.
 */
public class GuavaFileTest {

    public Result dealFile(File file) throws IOException {
        return Files.readLines(file, Charsets.UTF_8, new LineProcessor<Result>() {
            Result result = new Result();

            public boolean processLine(String s) throws IOException {
                //处理每一行 merge到result
                return true;
            }

            public Result getResult() {
                return result;
            }
        });
    }

    public static void main(String[] args) throws IOException {
        System.out.println(GuavaFileTest.class.getResource("/file").getFile());
        System.out.println(new GuavaFileTest().dealFile(new File(GuavaFileTest.class.getResource("/file").getFile())).getList());
    }

    class Result {
        List<String> list = Lists.newArrayList();

        public List<String> getList() {
            return list;
        }

        public void setList(List<String> list) {
            this.list = list;
        }
    }
}
