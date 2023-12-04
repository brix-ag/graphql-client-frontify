package ch.brix.gql.client.frontify.builders;

public class On_CreateFolder extends ch.brix.gql.client.TypeBuilder {
  public On_CreateFolder() {
    super(new ch.brix.gql.client.On("CreateFolder"));
  }
  /**
   * The newly created `Folder`.
   */
  public On_CreateFolder folder(CreateFolder_folder callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
