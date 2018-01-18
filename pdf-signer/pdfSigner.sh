#!/bin/bash
SIGN_HOME_DIR=/usr/local/pdfSigner
PATH=$PATH:$SIGN_HOME_DIR
export PATH
JVM_OPTION="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5006"

case "$1" in
  start)
    echo "Starting pdf signer..."
    java -jar ${JVM_OPTION} -Djava.io.tmpdir="$SIGN_HOME_DIR/cache" $SIGN_HOME_DIR/pdf-signer.jar -d"$SIGN_HOME_DIR">> $SIGN_HOME_DIR/log &
    echo $! > $SIGN_HOME_DIR/pid
    ;;
  stop)
    echo "Stopping pdf signer"
    PID=$(cat $SIGN_HOME_DIR/pid)
    kill -9 $PID
    ;;
  restart)
    echo "Stopping pdf signer..."
    PID=$(cat $SIGN_HOME_DIR/pid)
    kill -9 $PID
    sleep 2;
    echo "Starting pdf signer..."
    java -jar ${JVM_OPTION} -Djava.io.tmpdir="$SIGN_HOME_DIR/cache" $SIGN_HOME_DIR/pdf-signer.jar -d"$SIGN_HOME_DIR">> $SIGN_HOME_DIR/log &
    echo $! > $SIGN_HOME_DIR/pid
    ;;
  *)
    echo "Usage: $0 {start|stop|restart}"
    ;;
esac

exit 0
