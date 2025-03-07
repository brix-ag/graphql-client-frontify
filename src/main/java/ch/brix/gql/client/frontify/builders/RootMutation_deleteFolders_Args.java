package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteFolders_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `DeleteFolders` input argument.
   * Default value: null
   */
  public RootMutation_deleteFolders_Args input(ch.brix.gql.client.frontify.input_objects.DeleteFoldersInput value) {
    _add_arg("input", value);
    return this;
  }
}
