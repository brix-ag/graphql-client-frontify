package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetVariant {
  /**
   * The key to identify the variant.
   */
  @com.google.gson.annotations.SerializedName("key")
  private ch.brix.gql.client.frontify.scalars.IdScalar key;
  /**
   * Filename of the `AssetVariant` `File`.
   */
  @com.google.gson.annotations.SerializedName("filename")
  private ch.brix.gql.client.frontify.scalars.StringScalar filename;
  /**
   * Signed `Url` to download the original `AssetVariant` from Frontify.
   */
  @com.google.gson.annotations.SerializedName("downloadUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar downloadUrl;
}
