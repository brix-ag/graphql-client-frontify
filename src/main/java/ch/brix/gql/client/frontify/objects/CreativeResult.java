package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeResult {
  /**
   * Signed `Url` to download the Creative.
   */
  @com.google.gson.annotations.SerializedName("downloadUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar downloadUrl;
  /**
   * List of signed `Url`s to download each page of the Creative.
   */
  @com.google.gson.annotations.SerializedName("pageDownloadUrls")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.UrlScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.UrlScalar> pageDownloadUrls;
  /**
   * `Asset` details of the stored asset when save-to has been used.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.objects.File asset;
}
