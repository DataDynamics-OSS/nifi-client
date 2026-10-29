# start-http.sh 에서 source 한다 (common.sh 의 prop_replace 사용).
prop_replace 'nifi.web.http.host'                     '0.0.0.0'
prop_replace 'nifi.web.http.port'                     "${NIFI_WEB_HTTP_PORT:-8080}"
prop_replace 'nifi.web.https.host'                    ''
prop_replace 'nifi.web.https.port'                    ''
prop_replace 'nifi.remote.input.secure'               'false'
prop_replace 'nifi.security.user.login.identity.provider' ''
prop_replace 'nifi.security.user.authorizer'          ''
for p in keystore keystoreType keystorePasswd keyPasswd truststore truststoreType truststorePasswd; do
  prop_replace "nifi.security.$p" ''
done
