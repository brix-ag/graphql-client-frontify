package ch.brix.gql.client.frontify.builders;

public class RootMutation_uploadFile extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UploadFile> {
  public RootMutation_uploadFile() {
    super(new ch.brix.gql.client.Call<>("uploadFile", "UploadFile"));
  }
  public RootMutation_uploadFile args(RootMutation_uploadFile_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_uploadFile onUploadFile(On_UploadFile typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
