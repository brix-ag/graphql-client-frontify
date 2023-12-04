package ch.brix.gql.client.frontify.builders;

public class On_UpdateFolder extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateFolder() {
    super(new ch.brix.gql.client.On("UpdateFolder"));
  }
  /**
   * `Folder` details.
   */
  public On_UpdateFolder folder(UpdateFolder_folder callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
