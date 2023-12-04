package ch.brix.gql.client.frontify.builders;

public class RootMutation_createExternalAsset_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `CreateExternalAsset` input argument.
   * Default value: null
   */
  public RootMutation_createExternalAsset_Args input(ch.brix.gql.client.frontify.input_objects.CreateExternalAssetInput value) {
    _add_arg("input", value);
    return this;
  }
}
