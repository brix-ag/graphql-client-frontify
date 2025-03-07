package ch.brix.gql.client.frontify.builders;

public class On_CreativeResult extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeResult() {
    super(new ch.brix.gql.client.On("CreativeResult"));
  }
  /**
   * **BETA** Signed `Url` to download the Creative.
   */
  public On_CreativeResult downloadUrl() {
    _add_field("downloadUrl");
    return this;
  }
  /**
   * **BETA** List of signed `Url`s to download each page of the Creative.
   */
  public On_CreativeResult pageDownloadUrls() {
    _add_field("pageDownloadUrls");
    return this;
  }
  /**
   * **BETA** `Asset` details of the stored asset when save-to has been used.
   */
  public On_CreativeResult asset(CreativeResult_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
