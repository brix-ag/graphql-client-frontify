package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UploadFile {
  /**
   * Signed Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * Arrays with upload `Urls` to upload the file.
   */
  @com.google.gson.annotations.SerializedName("urls")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.UrlScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.UrlScalar> urls;
}
