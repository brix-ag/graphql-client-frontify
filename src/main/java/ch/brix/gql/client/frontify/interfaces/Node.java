package ch.brix.gql.client.frontify.interfaces;

/**
 * `NodeInterface` is the base for all types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.Audio.class, ch.brix.gql.client.frontify.objects.Document.class, ch.brix.gql.client.frontify.objects.Image.class, ch.brix.gql.client.frontify.objects.Video.class, ch.brix.gql.client.frontify.objects.File.class, ch.brix.gql.client.frontify.objects.EmbeddedContent.class, ch.brix.gql.client.frontify.objects.AssetAttachment.class, ch.brix.gql.client.frontify.objects.AssetComment.class, ch.brix.gql.client.frontify.objects.SubFolder.class, ch.brix.gql.client.frontify.objects.MediaLibrary.class, ch.brix.gql.client.frontify.objects.IconLibrary.class, ch.brix.gql.client.frontify.objects.LogoLibrary.class, ch.brix.gql.client.frontify.objects.DocumentLibrary.class, ch.brix.gql.client.frontify.objects.Account.class, ch.brix.gql.client.frontify.objects.AccountUser.class, ch.brix.gql.client.frontify.objects.Brand.class, ch.brix.gql.client.frontify.objects.LibraryPageCollection.class, ch.brix.gql.client.frontify.objects.CustomMetadataProperty.class, ch.brix.gql.client.frontify.objects.Guideline.class, ch.brix.gql.client.frontify.objects.Collection.class, ch.brix.gql.client.frontify.objects.LibraryPage.class, ch.brix.gql.client.frontify.objects.ProjectWebhook.class, ch.brix.gql.client.frontify.objects.UserGroup.class, ch.brix.gql.client.frontify.objects.Workspace.class})
public interface Node {
  /**
   * `Node` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
}
