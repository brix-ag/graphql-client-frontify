package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetPreviewImage_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `AddAssetPreviewImage` input argument.
   * Default value: null
   */
  public RootMutation_addAssetPreviewImage_Args input(ch.brix.gql.client.frontify.input_objects.AddAssetPreviewImageInput value) {
    _add_arg("input", value);
    return this;
  }
}
