package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeTemplatePage {
  /**
   * Preview URL of `CreativeTemplatePage`.
   */
  @com.google.gson.annotations.SerializedName("previewUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar previewUrl;
  /**
   * Width of the `CreativeTemplatePage`.
   */
  @com.google.gson.annotations.SerializedName("width")
  private ch.brix.gql.client.frontify.scalars.IntScalar width;
  /**
   * Height of the `CreativeTemplatePage`.
   */
  @com.google.gson.annotations.SerializedName("height")
  private ch.brix.gql.client.frontify.scalars.IntScalar height;
  /**
   * `CreativeTemplatePage` unique identifier.
   */
  @com.google.gson.annotations.SerializedName("pageIndex")
  private ch.brix.gql.client.frontify.scalars.IntScalar pageIndex;
  /**
   * Name of the `CreativeTemplatePage`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
