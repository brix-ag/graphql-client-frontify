package ch.brix.gql.client.frontify.builders;

public class On_UploadFile extends ch.brix.gql.client.TypeBuilder {
  public On_UploadFile() {
    super(new ch.brix.gql.client.On("UploadFile"));
  }
  /**
   * Signed Id.
   */
  public On_UploadFile id() {
    _add_field("id");
    return this;
  }
  /**
   * Arrays with upload `Urls` to upload the file.
   */
  public On_UploadFile urls() {
    _add_field("urls");
    return this;
  }
}
