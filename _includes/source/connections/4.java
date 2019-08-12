ConnectionConfig.builder()
  .url("ldap://directory.ldaptive.org")
  .useStartTLS(true)
  .connectTimeout(Duration.ofSeconds(5))
  .responseTimeout(Duration.ofSeconds(5))
  .sslConfig(SslConfig.builder()
    .credentialConfig(KeyStoreCredentialConfig.builder()
      .trustStore("classpath:/my.truststore")
      .build())
    .build())
  .build();
