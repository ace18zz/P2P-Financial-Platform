package cn.itcast.Loansp2p.depository.config;


import cn.itcast.Loansp2p.common.cache.Cache;
import cn.itcast.Loansp2p.depository.common.cache.RedisCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;


@Configuration
public class RedisConfig {
	
	@Bean
	public Cache cache(StringRedisTemplate redisTemplate){
		return new RedisCache(redisTemplate);
	}
	

}
