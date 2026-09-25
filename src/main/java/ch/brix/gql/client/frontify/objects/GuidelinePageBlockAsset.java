package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlockAsset {
  /**
   * **BETA** Preview `Url` which has optional `width` and `height` arguments.
   */
  @com.google.gson.annotations.SerializedName("previewUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar previewUrl;
}
