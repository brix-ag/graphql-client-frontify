package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetLicense_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `RemoveAssetLicense` input argument.
   * Default value: null
   */
  public RootMutation_removeAssetLicense_Args input(ch.brix.gql.client.frontify.input_objects.RemoveAssetLicenseInput value) {
    _add_arg("input", value);
    return this;
  }
}
