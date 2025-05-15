package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlock {
  /**
   * **BETA** The id of the `GuidelinePageBlock`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The searchable content of the `GuidelinePageBlock`. When the block cannot be serialized, this field is `null`.
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.scalars.StringScalar content;
  /**
   * **BETA** The url of the `GuidelinePageBlock`
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageBlock`. If not modified, this represents the creation time.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
}
