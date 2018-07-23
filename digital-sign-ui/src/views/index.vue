/**
 * @file index.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/18/18
 */
<template>
  <div>
    <Row>
      <Col span="18" offset="3">
      <Card>
        <Steps :current="current">
          <Step title="初始化证书容器" content="输入证书容器相关信息，生成JKS"></Step>
          <Step title="生成证书" content="利用RSA2算法，生成自签证书，并存储于JKS容器"></Step>
          <Step title="执行签名" content="选择证书，调用签名算法签署在PDF上"></Step>
          <Step title="下载" content="下载带有数字证书的PDF文档，推荐使用Adobe Acrobat查看证书"></Step>
        </Steps>
        <upload-doc v-if="current == 0"></upload-doc>
        <upload-signer v-if="current == 1"></upload-signer>
        <confirm-info v-if="current == 2"></confirm-info>
        <download-doc v-if="current == 3"></download-doc>
      </Card>
      </Col>
    </Row>
  </div>
</template>
<script>
import util from '@/libs/util'
import uploadDoc from '@/components/upload-doc'
import uploadSigner from '@/components/upload-signer'
import confirmInfo from '@/components/confirm-info'
import downloadDoc from '@/components/download-doc'
export default {
  name: 'index',
  components: {
    uploadDoc, uploadSigner, confirmInfo, downloadDoc
  },
  data () {
    return {
      current: 0,
      ws: null,
      convertId: 0,
      doc: null
    }
  },
  created () {
    this.convertId = util.randNumber(5);
  },
  nextStep () {
    this.current++;
  },
  prevStep () {
    this.current--;
  }
}
</script>
