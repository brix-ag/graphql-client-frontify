package ch.brix.gql.client.frontify.enums;

/**
 * The events a webhook can subscribe to.
 */
public enum AssetWebhookEvent {
  @com.google.gson.annotations.SerializedName("ASSET_ATTACHMENT_ADDED") 
  ASSET_ATTACHMENT_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_ATTACHMENT_REMOVED") 
  ASSET_ATTACHMENT_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_COLLECTION_ADDED") 
  ASSET_COLLECTION_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_COLLECTION_REMOVED") 
  ASSET_COLLECTION_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_CREATED") 
  ASSET_CREATED,
  @com.google.gson.annotations.SerializedName("ASSET_CUSTOM_METADATA_UPDATED") 
  ASSET_CUSTOM_METADATA_UPDATED,
  @com.google.gson.annotations.SerializedName("ASSET_DELETED") 
  ASSET_DELETED,
  @com.google.gson.annotations.SerializedName("ASSET_LICENCE_ADDED") 
  ASSET_LICENCE_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_LICENCE_REMOVED") 
  ASSET_LICENCE_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_MOVED") 
  ASSET_MOVED,
  @com.google.gson.annotations.SerializedName("ASSET_PROCESSED") 
  ASSET_PROCESSED,
  @com.google.gson.annotations.SerializedName("ASSET_RELATION_ADDED") 
  ASSET_RELATION_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_RELATION_REMOVED") 
  ASSET_RELATION_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_REVISION_ADDED") 
  ASSET_REVISION_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_TAG_ADDED") 
  ASSET_TAG_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_TAG_REMOVED") 
  ASSET_TAG_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_TARGET_CHANGED") 
  ASSET_TARGET_CHANGED,
  @com.google.gson.annotations.SerializedName("ASSET_UPDATED") 
  ASSET_UPDATED,
  @com.google.gson.annotations.SerializedName("ASSET_VARIANT_ADDED") 
  ASSET_VARIANT_ADDED,
  @com.google.gson.annotations.SerializedName("ASSET_VARIANT_REMOVED") 
  ASSET_VARIANT_REMOVED,
  @com.google.gson.annotations.SerializedName("ASSET_VARIANT_UPDATED") 
  ASSET_VARIANT_UPDATED,
  @com.google.gson.annotations.SerializedName("WORKFLOW_TASK_ASSIGNED") 
  WORKFLOW_TASK_ASSIGNED,
  @com.google.gson.annotations.SerializedName("WORKFLOW_TASK_DELETED") 
  WORKFLOW_TASK_DELETED,
  @com.google.gson.annotations.SerializedName("WORKFLOW_TASK_MOVED") 
  WORKFLOW_TASK_MOVED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
