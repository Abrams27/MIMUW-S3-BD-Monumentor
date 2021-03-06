package bd.monumentor.otwarte.zabytki.downloader.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "downloader")
public class DownloaderProperties {

  private String url;

}
