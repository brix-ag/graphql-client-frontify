package ch.brix.gql.client.frontify.builders;

public class RootMutation_createFolder_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateFolder` input argument.
   * Default value: null
   */
  public RootMutation_createFolder_Args input(ch.brix.gql.client.frontify.input_objects.CreateFolderInput value) {
    _add_arg("input", value);
    return this;
  }
}
