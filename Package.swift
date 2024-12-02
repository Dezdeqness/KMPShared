// swift-tools-version:5.3
import PackageDescription

// BEGIN KMMBRIDGE VARIABLES BLOCK (do not edit)
let remoteKotlinUrl = "https://api.github.com/repos/Dezdeqness/KMPShared/releases/assets/210507292.zip"
let remoteKotlinChecksum = "b9262433d63a790cd598cd4d0ccac54b3b41f59da8e0d5f9048f094789700588"
let packageName = "SharedKMP"
// END KMMBRIDGE BLOCK

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)