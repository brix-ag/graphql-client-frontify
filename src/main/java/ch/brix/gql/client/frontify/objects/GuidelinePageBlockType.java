package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlockType {
  /**
   * **BETA** The block type id of a `GuidelinePageBlock`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The block type name of a `GuidelinePageBlock`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * **BETA** The JSON schema defining the expected settings structure for a `GuidelinePageBlock` of this type.
   */
  @com.google.gson.annotations.SerializedName("settingsSchema")
  private ch.brix.gql.client.frontify.scalars.JsonObjectScalar settingsSchema;
}
