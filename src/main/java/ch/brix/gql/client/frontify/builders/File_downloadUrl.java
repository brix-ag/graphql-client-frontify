package ch.brix.gql.client.frontify.builders;

public class File_downloadUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public File_downloadUrl() {
    super(new ch.brix.gql.client.Call<>("downloadUrl", "Url"));
  }
  public File_downloadUrl args(File_downloadUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
