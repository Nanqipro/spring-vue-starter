<!--js 逻辑部分-->
<script setup>
    import { ref } from 'vue'
    // 声明相应式数据 ref 
    const count = ref(0)
    
</script>

<!--html-->
<template>
    <button @click="count++">count:{{ count }}</button>
  
</template>

<!--css-->
<style scoped>

</style>
