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
          <Step title="上传合同文档" content="上传一个doc或PDF文档"></Step>
          <Step title="填写签署人" content="上传参与合同签署人的相关信息，限制为两人"></Step>
          <Step title="签署信息确认" content="后端自动生成签署人证书信息、签署位置、签章图片等相关信息"></Step>
          <Step title="下载合同文档" content="下载带有双方证书签名的合同文档"></Step>
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
