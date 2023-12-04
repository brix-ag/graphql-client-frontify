package ch.brix.gql.client.frontify.builders;

public class CreateFolder_folder extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Folder> {
  public CreateFolder_folder() {
    super(new ch.brix.gql.client.Call<>("folder", "Folder"));
  }
  public CreateFolder_folder onSubFolder(On_SubFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CreateFolder_folder onFolder(On_Folder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
