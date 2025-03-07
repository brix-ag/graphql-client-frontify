package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetLicense_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `AddAssetLicense` input argument.
   * Default value: null
   */
  public RootMutation_addAssetLicense_Args input(ch.brix.gql.client.frontify.input_objects.AddAssetLicenseInput value) {
    _add_arg("input", value);
    return this;
  }
}
