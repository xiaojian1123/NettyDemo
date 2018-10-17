package com.xiaojian.nettydemo;

import com.xiaojian.nettydemo.client.NettyClient;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetSocketAddress;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class NettyDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void nettyClient(){


    }
}
